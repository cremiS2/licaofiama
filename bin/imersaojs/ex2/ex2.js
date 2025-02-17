let mes = parseInt(prompt("Digite o numero do mes (de 1 a 12): "));

switch(mes){
    
    case 1:
        msg = "janeiro" 
        //console.log(Janeiro)
        break;
    case 2:
        msg = "fevereiro"
        break; 
    case 3:
        msg = "março"
        break; 
    case 4:
        msg = "abril"
        break; 
    case 5:
        msg = "maio"
        break; 
    case 6:
        msg = "unho"
        break; 
    case 7:
        msg = "julho"
        break; 
    case 8:
        msg = "agosto"
        break; 
    case 9:
        msg = "setembro"
        break;   
    case 10:
        msg = "outubro"
        break;
    case 11:
        msg = "novembro"
        break;
    case 12:
        msg = "dezembro"
    break;
    default:
    text = "Numero invalido"
}
console.log(msg)