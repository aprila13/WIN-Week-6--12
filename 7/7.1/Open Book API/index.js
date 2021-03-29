// Grabbing elements
let search = document.getElementById('search'),
    submit = document.getElementById('submit'),
    writer = document.getElementById('writer'),
    writer1 = document.getElementById('writer1'),
    writer2 = document.getElementById('writer2'),
    title = document.getElementById('title'),
    title1 = document.getElementById('title1'),
    title2 = document.getElementById('title2'),
    image = document.getElementById('image'),
    image1 = document.getElementById('image1'),
    image2 = document.getElementById('image2'),
    display = document.getElementById('display');

    submit.addEventListener('click', findAuthor)

    let myHeaders = new Headers();
    myHeaders.append("Cookie", "__cfduid=d354e8c66446965133da840d1d57820451615506517");
    
    let requestOptions = {
      method: 'GET',
      headers: myHeaders,
      redirect: 'follow'
    };

    function findAuthor(event) {
      event.preventDefault();
      let author = search.value;

      fetch(`http://openlibrary.org/search.json?author=${author}`, requestOptions)
      .then(response => response.json())
      .then(result => {
        console.log(result.docs)

        writer.innerHTML = result.docs[0]["author_name"][0];
        writer1.innerHTML = result.docs[1]["author_name"][0];
        writer2.innerHTML = result.docs[2]["author_name"][0];

        title.innerHTML = result.docs[0].title;
        title1.innerHTML = result.docs[1].title;
        title2.innerHTML = result.docs[2].title;

        image.src = `http://covers.openlibrary.org/b/id/${result.docs[0].cover_i}-L.jpg`;
        image1.src = `http://covers.openlibrary.org/b/id/${result.docs[1].cover_i}-L.jpg`;
        image2.src = `http://covers.openlibrary.org/b/id/${result.docs[2].cover_i}-L.jpg`;

        display.style.visibility = 'visible';
        
        image.style.width = '254px';
        image.style.height = '393px';
        image1.style.width = '254px';
        image1.style.height = '393px';
        image2.style.width = '254px';
        image2.style.height = '393px';
      })
      .catch(error => console.log('error', error));
    }