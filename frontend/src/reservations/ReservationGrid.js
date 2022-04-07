
import React from 'react';

class  ReservationGrid extends React.Component{
    constructor(props){
        super(props);
        this.state={
           reservations:[]
        };
    }
    componentDidMount(){
      fetch("http://localhost/api/reservations")
      .then(response=>response.json())
      .then(data=>{
        this.setState({reservations:data});
      });
    }
    componentWillUnmount() {

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
                <button class="btn btn-primary">Réserver à nouveau</button>
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