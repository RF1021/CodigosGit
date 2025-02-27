//la expresión git switch es la que evalua una expresion mientras que case realiza declaraciones asociadas a este
// lo que hace el switch case es el permitirnos ejecutar diferentes bloques de codigo
//dependiendo de el valor y la expresion, si case en este caso no le añadimos un "break" este
//continuara ejecutandose sobre los demas case
//ejemplo del switch case en las versiones de java anteriores de java 12:
int numero = 2
        switch (numero) {
    case 1:
        system.out.printin(numero 1);
        break;
    case 2:
        system.out.printin(numero 2);
        break;
    case 3:
        system.out.printin(numero 1);
        break;
        }
//ejemplo de switch case en versiones posteriores a java 12
int numero = 2;

String resultado = switch (numero) {
    case 1 -> "Es uno";
    case 2 -> "Es dos";
    case 3 -> "Es tres";
};

System.out.println(resultado);
//en resumen la expresion switch case puede ayudar a tener un codigo que aparte de ser mas eficiente
//y limpia, sirve como una alternativa al usar multiples comandos como lo son el if-else
//es recomendable usar switch case cuando se tienen varias condiciones basadas en el valor de una variable.
