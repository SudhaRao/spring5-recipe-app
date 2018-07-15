/* Clicktags
/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
function $(id) { return document.getElementById(id) };

var add = document.addEventListener ? 'addEventListener' : 'attachEvent';
var ZV = 'Zip Code';

var zs = $('zipSubmit');
var f = $('cta');
var z = $('zipCode');
var aa = $('bgExitArea');

f[add]('click', onFormClick);
z[add]('focus', onZipFocus);
z[add]('blur', onZipBlur);
z[add]('keydown', onZipKeydown);
zs[add]('click', zipSubmit);
aa[add]('click', zipSubmit);

function onFormClick(e) {
    e.stopImmediatePropagation();
}
function onZipFocus() {
    if (z.value === ZV) {
        z.value = '';
    }
}
function onZipBlur() {
    z.value = z.value || ZV;
}
function onZipKeydown(e) {
    var k = e.which ? e.which : e.keyCode;
    // allow only numbers, arrows, delete, enter and backspace
    if (!e.metaKey && !((k > 47 && k < 58) || (k > 95 && k < 106) || (k > 36 && k < 41) || k == 46 || k == 13 || k == 8)) {
        e.preventDefault();
    }
    if (k == 13) {
        zipSubmit();
    }
}
function zipSubmit() {
    if (z.value != "ZIP CODE" && z.value.length == 5) {
        window.open(window.clickTag2 + "&ZipCode=" + z.value, "_blank");
    } else {
        window.open(window.clickTag, "_blank");
    }
}