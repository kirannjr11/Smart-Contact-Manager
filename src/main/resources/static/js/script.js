console.log("kiran");

let currentTheme = getTheme();


document.addEventListener("DOMContentLoaded", () => {
  changeTheme();
});

function changeTheme() {
    changePageTheme(currentTheme, "");
     const changeThemeButton = document.querySelector("#theme_change_button");

     changeThemeButton.addEventListener("click",(event)=> {
        let oldTheme = currentTheme
        console.log("change theme button clicked")
        if(currentTheme === "dark") {
            currentTheme = "light";
        } else {
            currentTheme = "dark";
        }
        console.log(currentTheme);
        changePageTheme(currentTheme, oldTheme)
     });
}

//set
function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

//get theme from the localStorage
function getTheme() {
    let theme = localStorage.getItem("theme");
    return theme ? theme : "light";
}

//change the current theme
function changePageTheme(theme, oldTheme) {
    setTheme(currentTheme);
    if(oldTheme) {
    document.querySelector("html").classList.remove(oldTheme);
    }
    document.querySelector("html").classList.add(theme);
    document
         .querySelector("#theme_change_button")
         .querySelector("span").textContent = theme == "light" ? "Dark" : "Light";
}
