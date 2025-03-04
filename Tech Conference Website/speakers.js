document.addEventListener("DOMContentLoaded", function () {
    fetch("speakers.json")
        .then(response => response.json())
        .then(data => {
            const speakerList = document.getElementById("speakerList");
            speakerList.innerHTML = data.map(speaker => `
                <div class="speaker">
                    <img src="${speaker.image}" alt="${speaker.name}">
                    <h3>${speaker.name}</h3>
                    <p><strong>${speaker.title}</strong> at ${speaker.company}</p>
                    <p>${speaker.bio}</p>
                </div>
            `).join("");
        })
        .catch(error => console.error("Error loading speakers:", error));
});
