FROM node

ENV NODE_ENV=production

RUN mkdir -p /usr/src/app

WORKDIR /usr/src/app

COPY index.js index.js

EXPOSE 8080

CMD ["node","index.js"]