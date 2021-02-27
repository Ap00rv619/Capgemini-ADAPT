  
const result = document.querySelector('#result');

const calSum = (number) => {
  let s = 0;
  for (let i = 1; i < number+1; i++) {
    if (i % 2 === 0) {
      s = s + i ;
    }
  }
  return s;
};

let s = calSum(20);

result.textContent = 'Total:' + s;
