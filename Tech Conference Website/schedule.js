document.addEventListener("DOMContentLoaded", function () {
    fetch("schedule.json")
        .then(response => response.json())
        .then(data => {
            const scheduleContainer = document.getElementById("schedule-list");
            const filterSelect = document.getElementById("track-filter");

            function renderSchedule(filter = "All") {
                scheduleContainer.innerHTML = "";
                data.forEach(session => {
                    if (filter === "All" || session.track === filter) {
                        const sessionItem = document.createElement("div");
                        sessionItem.classList.add("schedule-item");
                        sessionItem.innerHTML = `
                            <strong>${session.time}</strong>: ${session.title} (${session.track})
                        `;
                        scheduleContainer.appendChild(sessionItem);
                    }
                });
            }

            filterSelect.addEventListener("change", () => {
                renderSchedule(filterSelect.value);
            });

            renderSchedule();
        })
        .catch(error => console.error("Error loading schedule:", error));
});
