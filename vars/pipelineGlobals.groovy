def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "506369992735"
        case 'qa':
            return "506369992735"
        case 'uat':
            return "506369992735"
        case 'pre-prod':
            return "506369992735"
        case 'prod':
            return "506369992735"
        default:
            return "nothing"
    } 
}