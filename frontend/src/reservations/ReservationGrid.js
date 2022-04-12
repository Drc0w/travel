
import React from 'react';

class  ReservationGrid extends React.Component{
    constructor(props){
        super(props);
        this.state={
           reservations:[]
        };

    }

    componentDidMount(){
      fetch(process.env.REACT_APP_API_RESERVATIONS)
      .then(response=>response.json())
      .then(data=>{
        this.setState({reservations:data});
      });
    }
    componentWillUnmount() {

    }
    render(){
      const gridRows=this.state.reservations.map((item)=>(
        <div class="row border" role="row">
            <div class="col-sm">
                Hôtel: {item.hotel} <br/>
            </div>
            <div class="col-sm">
                Date:{item.date}<br/>
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
      <div class="container" role="grid">
        <h2>Réservations Passées</h2>
        {gridRows}
      </div>
      );
    }
}

export default ReservationGrid;