FROM node:13.12.0-alpine as build
WORKDIR /opt/travel
ENV PATH /opt/travel/node_modules/.bin:$PATH
COPY package.json ./
COPY package-lock.json ./
RUN npm ci --silent
RUN npm install react-scripts@3.4.1 -g --silent
COPY . ./
EXPOSE 80
ENV REACT_APP_API_RESERVATIONS="http://localhost:8081/api/reservations"
CMD ["npm", "start"]

