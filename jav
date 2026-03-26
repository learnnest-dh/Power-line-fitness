// SELECT ELEMENTS
const hamburger = document.querySelector(".hamburger");
const mobileMenu = document.querySelector(".mobile-menu");

// TOGGLE MOBILE MENU
hamburger.addEventListener("click", () => {
  mobileMenu.classList.toggle("open");
});


// CLOSE MENU WHEN CLICKING A LINK (mobile UX)
const menuLinks = document.querySelectorAll(".mobile-menu a");

menuLinks.forEach(link => {
  link.addEventListener("click", () => {
    mobileMenu.classList.remove("open");
  });
});


// OPTIONAL: CHANGE NAVBAR STYLE ON SCROLL
const nav = document.querySelector("nav");

window.addEventListener("scroll", () => {
  if (window.scrollY > 50) {
    nav.style.background = "rgba(12,12,12,0.98)";
  } else {
    nav.style.background = "rgba(12,12,12,0.92)";
  }
});
