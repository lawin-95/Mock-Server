function onOffSwipeButton() {
    var ch = document.getElementById("isEnabled");
    var isEnabled = ch.checked;
    const Http = new XMLHttpRequest();
    const url = '/setServerEnabled?enabled=' + isEnabled
    Http.open("GET", url);
    Http.send();
    Http.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(Http.responseText)
        }
    }
}
function init() {
    var ch = document.getElementById("isEnabled");
    const Http = new XMLHttpRequest();
    const url = '/isServerEnabled'
    Http.open("GET", url);
    Http.send();
    Http.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            if (Http.responseText == "true") {
                ch.checked = true;

            }
        }
    }
}
document.addEventListener("DOMContentLoaded", function (event) {
    init();
});
function setCustomer(customer) {
    const Http = new XMLHttpRequest();
    const url = '/setCustomer?customer=' + customer
    Http.open("GET", url);
    Http.send();
    Http.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(Http.responseText)

        }
    }


}

function getCustomer() {
    const Http = new XMLHttpRequest();
    const url2 = '/getCustomer'
    Http.open("GET", url2);
    Http.send();
    Http.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(Http.responseText)
        }
    }
}
function onCustomerChange() {
    var xPath = '//label[@class="container"]/input'
    var elements = getElementsByXpath(xPath)
    var element = null
    while (element = elements.iterateNext()) {
        if (element.checked) {
            customer = element.id
            console.log(customer)
            setCustomer(customer)
            break
        }

    }

}


function getElementsByXpath(path) {
    return document.evaluate(path, document, null, XPathResult.ANY_TYPE, null);
}