// // Grabbing elements
let searchBar = document.querySelector('.search'),
  submitBtn = document.querySelector('.submit'),
  writerText = document.querySelector('.writer'),
  titleText = document.querySelector('.title'),
  imageBox = document.querySelector('.image'),
  writerText2 = document.querySelector('.writer2'),
  titleText2 = document.querySelector('.title2'),
  imageBox2 = document.querySelector('.image2'),
  writerText3 = document.querySelector('.writer3'),
  titleText3 = document.querySelector('.title3'),
  imageBox3 = document.querySelector('.image3'),
  display = document.getElementById('display');

// //submit button is clicked and the function runs
submitBtn.addEventListener('click', findBook)

// //request headers
let myHeaders = new Headers();
myHeaders.append("Cookie", "__cfduid=d354e8c66446965133da840d1d57820451615506517");

let requestOptions = {
  method: 'GET',
  headers: myHeaders,
  redirect: 'follow'
};

// //function to fetch data
function findBook(event) {
  event.preventDefault();
  let bookTitle = search.value;
  console.log(bookTitle)
  fetch(`http://openlibrary.org/search.json?title=${bookTitle}`, requestOptions)
    .then(response => response.json())
    .then(result => {
      console.log(result.docs)

      writerText.innerHTML = result.docs[0]["author_name"][0];
      writerText2.innerHTML = result.docs[1]["author_name"][0];
      writerText3.innerHTML = result.docs[2]["author_name"][0];

      titleText.innerHTML = result.docs[0].title;
      titleText2.innerHTML = result.docs[1].title;
      titleText3.innerHTML = result.docs[2].title;

      imageBox.src = `http://covers.openlibrary.org/b/id/${result.docs[0].cover_i}-L.jpg`;
      imageBox2.src = `http://covers.openlibrary.org/b/id/${result.docs[1].cover_i}-L.jpg`;
      imageBox3.src = `http://covers.openlibrary.org/b/id/${result.docs[2].cover_i}-L.jpg`;

      display.style.visibility = 'visible';

      imageBox.style.width = '254px';
      imageBox.style.height = '393px';
      imageBox2.style.width = '254px';
      imageBox2.style.height = '393px';
      imageBox3.style.width = '254px';
      imageBox3.style.height = '393px';
    })
    .catch(error => console.log('error', error));
}