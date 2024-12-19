input = '134589';
output = input[0];
for(i=1;i<input.length;i++){
    if(input[i]-input[i-1] == 1){
        output = output.concat(input[i]);
    } else {
        output = output.concat(" "+input[i]);
    }
}
console.log(output);