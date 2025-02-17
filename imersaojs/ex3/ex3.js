let cargo = parseInt(prompt("Digite o número do seu cargo: \n 1.ADM \n 2.Usuario \n 3.Visitante"));
let sADM = "12345";
let sVIS = "54321";
let sUSU = "67890";

switch (cargo) {
    case 1:
        let senhaA = parseInt(prompt("Digite a senha de adm:"));
        if((senhaA==sADM) && (cargo==1)){
            console.log("Bem vindo, ADM!");
        }
        else {
            console.log("Inválido");
        }
        break;
    case 2:
        let senhaV = parseInt(prompt("Digite a senha de visitante:"));
        if((senhaV==sVIS) && (cargo==2)){
            console.log("Bem vindo, visitante!");
        }
        else {
            console.log("Inválido");
        }
        break;
    case 3:
        let senhaU = parseInt(prompt("Digite a senha de usúario:"));
        if((senhaU==sUSU) && (cargo==3)){
            console.log("Bem vindo, usúario!");
        }
        else {
            console.log("Inválido");
        }
        break;
        default:
        console.log("Opção inválida.");
    }