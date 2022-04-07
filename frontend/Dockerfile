FROM node:13.12.0-alpine as build
WORKDIR /opt/travel
ENV PATH /opt/travel/node_modules/.bin:$PATH
COPY package.json ./
COPY package-lock.json ./
RUN npm ci --silent
RUN npm install react-scripts@3.4.1 -g --silent
COPY . ./
RUN npm run build

# production environment
FROM nginx:stable-alpine
COPY --from=build /opt/travel/build /usr/share/nginx/html
EXPOSE 80
ENV REACT_APP_API_RESERVATIONS="http://localhost:8081/api/reservations"
CMD ["nginx", "-g", "daemon off;"]