function sumAndVat (a) {


    let sum = 0;
    for (let i=0;i<a.length;i++){
        sum = sum+a[i];
    }
    let vat = sum * 0.2;
    let total = sum +vat;

    console.log('sum = '+ sum);
    console.log('VAT = '+ vat);
    console.log('total = '+ total);

}

sumAndVat ([1.20, 2.60, 3.50,5,115]);
