function areaSquares(a,b,c,d) {
    withOne = Number(a);
    heightOne =Number(b);
    widthTwo = Number(c);
    heightTwo = Number(d);
    let widthThree=0;
    let heightThree=0;
    if(withOne<widthTwo){
        widthThree=withOne;
    }else {

        widthThree=widthTwo;
    }

    if(heightOne<heightTwo){
        heightThree=heightOne;
    }else {
        heightThree=heightTwo;
    }
    let areaOne=withOne*heightOne;
    let areaTwo =widthTwo*heightTwo;
    let areaThree = widthThree*heightThree;
    let area = areaOne+areaTwo-areaThree;
    return area;
}

console.log(areaSquares(13, 2, 5, 8));
