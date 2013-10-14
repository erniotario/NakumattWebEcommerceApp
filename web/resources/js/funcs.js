/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
function notifier(data){
    if(is_int(data)){
        alert("Operation Done Successfully");   
    }
    else{
        alert(data);  
    }
}

function is_int(value){
    if((parseFloat(value) == parseInt(value)) && !isNaN(value)){
        return true;
    } else {
        return false;
    }
}


function hiddenDate(dateField) {
    var name = dateField.attr("name");
    var value = dateField.val();
    var hidden = $("<input></input>");
    hidden.prop("type", "hidden");
    hidden.prop("name", name);
    hidden.prop("id", "hid" + name);
    hidden.val(dateField.val());
    dateField.after(hidden);
    dateField.removeAttr("name");
 
    var dateValue = value.match(/^(\d{4})-(\d{1,2})-(\d{1,2})$/);
    if (dateValue)
        dateField.val(dateValue[3] + "/" + dateValue[2] + "/" + dateValue[1]);
    return hidden;
}
 
if (!window.Modernizr.inputtypes.date) {
    $("input[type='date']").each(function () {
        var $this = $(this);
        var hidden = hiddenDate($this);
        $this.datepicker(
                {
                    prevText: "",
                    nextText: "",
                    changeMonth: true,
                    changeYear: true,
                    altField: hidden,
                    altFormat: "yy-mm-dd"
                });
    });
}