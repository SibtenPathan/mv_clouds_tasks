document.getElementById('csvFile').addEventListener('change', function (event) {
    const file = event.target.files[0];
    if (!file) return;

    const reader = new FileReader();
    reader.onload = function (e) {
        const content = e.target.result;
        parseCSV(content);
    };
    reader.readAsText(file);
});

function parseCSV(content) {
    const rows = content.split('\n');
    const imageLinks = rows.map(row => row.split(',')[0].trim()).filter(link => link);

    displayImages(imageLinks);
}

function displayImages(imageLinks) {
    const tableBody = document.querySelector('#imageTable tbody');
    tableBody.innerHTML = ''; 

    imageLinks.forEach(link => {
        const row = document.createElement('tr');

        // Image Column
        const imgCell = document.createElement('td');
        const img = document.createElement('img');
        img.src = link;
        img.alt = "Image";
        imgCell.appendChild(img);

        // Button Column
        const buttonCell = document.createElement('td');
        const button = document.createElement('button');
        button.textContent = 'Download';
        button.onclick = function () {
            downloadImage(link);
        };
        buttonCell.appendChild(button);

        row.appendChild(imgCell);
        row.appendChild(buttonCell);
        tableBody.appendChild(row);
    });
}

function downloadImage(url) {
    const a = document.createElement('a');
    a.href = url;
    a.download = url.substring(url.lastIndexOf('/') + 1);
    a.click();
}
