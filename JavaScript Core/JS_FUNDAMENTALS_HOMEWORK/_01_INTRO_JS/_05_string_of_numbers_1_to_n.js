function stringNumbers(numStr) {
    let num =  parseInt(numStr);
    let str = '';
    for (let i = 1 ; i<=num;i++){
        str = str+i;

    }
    console.log(str);
}
stringNumbers('11');
