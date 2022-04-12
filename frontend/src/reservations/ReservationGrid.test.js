// __tests__/fetch.test.js
import React from 'react'
import {rest} from 'msw'
import {setupServer} from 'msw/node'
import {render, fireEvent, waitFor, screen} from '@testing-library/react'
import '@testing-library/jest-dom'
import ReservationGrid from './ReservationGrid'

const server = setupServer(
  rest.get('/api/reservations', (req, res, ctx) => {
    return res(ctx.json(
    [{"hotel":"Ritz","chambre":"Simple","nuits":1,"montant":100,"id":1,"date":"2022-03-03"},{"hotel":"Platza","chambre":"Double","nuits":2,"montant":200,"id":2,"date":"2022-03-03"},{"hotel":"Hilton","chambre":"Triple","nuits":3,"montant":300,"id":3,"date":"2022-03-03"}]
    ))
  }),
)

beforeAll(() => server.listen())
afterEach(() => server.resetHandlers())
afterAll(() => server.close())

test('loads and displays reservations', async () => {
  render(<ReservationGrid />)

 // fireEvent.click(screen.getByText('Load Greeting'))

  await waitFor(() => screen.getAllByRole('row'))

  expect(screen.getByRole('grid')).toBeInTheDocument()
  const rowElements= screen.getAllByRole('row')
  expect(rowElements[0]).toHaveTextContent('Ritz')
  expect(rowElements[1]).toHaveTextContent('Platza')
  expect(rowElements[2]).toHaveTextContent('Hilton')

})