
import React from 'react';

class  ReservationForm extends React.Component{
    constructor(props){
        super(props);
        this.state={
           hotels:["Hilton","Platza","Ritz" ],
           chambres:[{lit:"Simple",prix:100},{lit:"Double",prix:200},{lit:"Triple",prix:300} ],
           reservation:{}
        }

    }
    render(){
      const hotelOptions=this.state.hotels.map((item)=>
        <option value={item}>{item}</option>
      );
      const chambreOptions=this.state.chambres.map((item)=>
              <option value={item}>{item.lit}</option>
      );
      return (
      <div class="container border">
      <h2>Réserver</h2>
      <form>
          <div class="form-group">
              <label for="fhotel">Hôtel:</label>
              <select id="fhotel" type="select" name="fhotel" class="form-control" value={this.state.reservation.hotel}>
               {hotelOptions}
              </select><br/>
          </div>
          <div class="form-group">
              <label for="fchambre">Chambre:</label>
              <select id="fchambre" type="select" name="fchambre" class="form-control"  value={this.state.reservation.chambre}>
                {chambreOptions}
              </select><br/>
          </div>
          <div class="form-group">
              <label for="fdate">Date d'entrée :</label>
              <input id="fdate" type="date" name="fdate" class="form-control"  value={this.state.reservation.date}/><br/>
          </div>
          <div class="form-group">
              <label for="fnuit">Nuits:</label>
              <input id="fnuit" type="number" name="fnuit" min="0" class="form-control"  value={this.state.reservation.nuits}/><br/>
          </div>
          <div class="form-group">
              <label for="fmontant">Montant:</label>
              <input id="fmontant" type="text" name="fmontant" min="0" class="form-control" value={this.state.reservation.montant}/><br/>
          </div>
          <input id="fsubmit" type="button" name="fsubmit" value="Réserver" class="btn btn-primary"/><br/>
      </form>
      </div>
      );
    }
}

export default ReservationForm;