function solve(args){
    let x1= args[0];
    let y1=args[1];
    let z1 = args[2];

    let x2= args[3];
    let y2=args[4];
    let z2 = args[5];

    let x3=x1-x2;
    let y3 = y1-y2;
    let z3 = z1-z2;

    let dist  = Math.sqrt(x3*x3+y3*y3+z3*z3);
    console.log(dist);

}
