function occLetter (word, letter) {
    let sum = 0;
    for (let i=0;i<word.length;i++ ){
        if (word[i]===letter) sum =sum+1;
    }
    console.log(sum);
}
occLetter('nuke','n');
