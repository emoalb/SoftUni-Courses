function solve (a){
    let speedOne= a[0]*1000/3600;
    let  speedTwo=a[1]*1000/3600;
    let time=a[2];
    let sOne = speedOne*time;
    let sTwo = speedTwo*time;

    let distance = Math.abs(sOne-sTwo);
    console.log(distance)

}
