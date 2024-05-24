function showSection(sectionId) {
    const sections = document.querySelectorAll('.info-card');
    sections.forEach(section => {
        section.classList.add('d-none');
    });

    const targetSection = document.getElementById(sectionId);
    if (targetSection) {
        targetSection.classList.remove('d-none');
    }
}