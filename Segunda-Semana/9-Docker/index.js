const http = require('http');


http.createServer((request, response) => {
    response.setHeader('Content-Type', 'text/html');
    response.write('<h1>Hello World Arpia!</h1>'
    + '<img src="https://media-exp1.licdn.com/dms/image/C4D0BAQEwHY-TYuh_mQ/company-logo_200_200/0/1552660574188?e=2159024400&v=beta&t=eCmx9IC7osqFrrEnyjp0gJvTDrGRj5iNIBz7aeXm08I" alt="Logo da Arpia Tecnologia">');
    response.end();
}).listen(8080);

console.log('Server running at http://localhost');