function showSection(sectionId) {
    const sections = document.querySelectorAll('.info-card');
    sections.forEach(section => {
        section.classList.add('d-none');
    });

    const targetSection = document.getElementById(sectionId);
    if (targetSection) {
        targetSection.classList.remove('d-none');
    }

    // Xóa lớp 'active' từ tất cả các liên kết trong thanh bên
    const navLinks = document.querySelectorAll('.nav-link');
    navLinks.forEach(link => {
        link.classList.remove('active');
    });

    // Thêm lớp 'active' cho liên kết được nhấn
    const activeLink = document.querySelector(`.nav-link[href="#${sectionId}"]`);
    if (activeLink) {
        activeLink.classList.add('active');
    }
}
