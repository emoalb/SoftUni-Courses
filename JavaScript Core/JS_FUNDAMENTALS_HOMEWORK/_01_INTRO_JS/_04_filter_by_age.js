function filterAge (ageFilter,firstP,firstA,secondP,secondA){

    if(firstA>=ageFilter) {
        console.log('{ name: \'' + firstP +'\', age: '+firstA+' }');
    }
    if(secondA>=ageFilter) {
        console.log('{ name: \'' + secondP +'\', age: '+secondA+' }');
    }

}

filterAge (12, 'Ivan', 15, 'Asen', 19);
