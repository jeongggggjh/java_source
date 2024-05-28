function func(num) {
  return num % 2 === 0 ? "짝수" : "홀수";
}

console.log(func(4)); 

function sumDigits(number) {
  const digits = number.toString().split('');
  const sum = digits.reduce((acc, digit) => acc + parseInt(digit), 0);
  return sum;
}


