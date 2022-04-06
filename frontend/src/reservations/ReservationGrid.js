
import React from 'react';

class  ReservationGrid extends React.Component{
    constructor(props){
    super(props);
    this.state={
        reservations:[
            {hotel:"Acme",date:new Date(), chambre:"Simple", nuits:1, montant:100},
            {hotel:"Meca",date:new Date(), chambre:"Double", nuits:2, montant:200},
            {hotel:"Contoso",date:new Date(), chambre:"Triple", nuits:3, montant:300},
            {hotel:"Starlink",date:new Date(), chambre:"Quadruple", nuits:4, montant:400}
        ]
    };

    }
    render(){
      const gridRows=this.state.reservations.map((item)=>(
        <div class="row border">
            <div class="col-sm">
                Hôtel: {item.hotel} <br/>
            </div>
            <div class="col-sm">
                Date:{item.date.toLocaleDateString()}<br/>
                Chambre: {item.chambre}<br/>
                Nuits: {item.nuits}<br/>
                Montant: {item.montant} euros<br/>
            </div>
            <div class="col-sm">
                <button>Réserver à nouveau</button>
            </div>
        </div>
      ));

      return (
      <div class="container  " >
        <h2>Réservations Passées</h2>
        {gridRows}
      </div>
      );
    }
}

export default ReservationGrid;