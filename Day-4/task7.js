const fs = require('fs');

function readWordsFromFile(filePath) {
  return new Promise((resolve, reject) => {
    fs.readFile(filePath, 'utf-8', (err, data) => {
      if (err) {
        reject(err);
      } else {
        resolve(data.trim().split('\n'));
      }
    });
  });
}

function findFirstRecurringChar(word, index = 0, seen = {}) {
  if (index >= word.length) {
    return null;
  }

  const char = word[index];

  if (seen[char]) {
    return { [char]: [seen[char], index] };
  }

  seen[char] = index;
  return findFirstRecurringChar(word, index + 1, seen);
}

async function processWords(filePath) {
  try {
    const words = await readWordsFromFile(filePath);
    words.forEach(word => {
      const result = findFirstRecurringChar(word);
      console.log(`For word "${word}", first recurring character and indices:`, result);
    });
  } catch (error) {
    console.error('Error reading the file:', error);
  }
}

processWords('example.txt');
