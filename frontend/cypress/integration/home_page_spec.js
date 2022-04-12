describe('The home page',()=>{
    it('succesfull loads',()=>{
        cy.intercept(
          {
            method: 'GET', // Route all GET requests
            url: '/api/reservations', // that have a URL that matches '/users/*'
          },
          [{"hotel":"Ritz","chambre":"Simple","nuits":1,"montant":100,"id":1,"date":"2022-03-03"},{"hotel":"Platza","chambre":"Double","nuits":2,"montant":200,"id":2,"date":"2022-03-03"},{"hotel":"Hilton","chambre":"Triple","nuits":3,"montant":300,"id":3,"date":"2022-03-03"}]
 // and force the response to be: []
        ).as('getReservations') // and assign an alias

        cy.visit('http://localhost:3000')

        cy.get('.container').should('be.visible')
        cy.get('.row').should('have.length',3)

    });
});