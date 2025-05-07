def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "932478401603"
        case 'qa':
            return "932478401603"
        case 'uat':
            return "932478401603"
        case 'pre-prod':
            return "932478401603"
        case 'prod':
            return "932478401603"
        default:
            return "nothing"
    } 
}