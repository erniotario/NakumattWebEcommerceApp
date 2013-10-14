$.fn.disabler=function(){
    $("#mnRegenerationDate").css("color", "#fff");
    ;
    //$("#mnRegenerationDate").css("cursor", "default");
    $("#mnSchoolFacilities").css("color", "#fff");
    ;
    //$("#mnSchoolFacilities").css("cursor", "default");
    $("#mnClasses").css("color", "#000");
    //$("#mnClasses").css("cursor", "default");
    $("#mnSchoolUsers").css("color", "#000");
    //$("#mnSchoolUsers").css("cursor", "default");
    $("#mnSchoolUserRoles").css("color", "#000");
    // $("#mnSchoolUserRoles").css("cursor", "default");
    $("#mnTeachers").css("color", "#000");
    //$("#mnTeachers").css("cursor", "default");
    $("#mnTeacherSchool").css("color", "#000");
    //$("#mnTeacherSchool").css("cursor", "default");
    $("#mnTeacherCourses").css("color", "#000");
    // $("#mnTeacherCourses").css("cursor", "default");
    $("#mnClassTeacher").css("color", "#000");
    //$("#mnClassTeacher").css("cursor", "default");
    $("#mnParents").css("color", "#fff");
    ;
    // $("#mnParents").css("cursor", "default");
    $("#mnStudent").css("color", "#fff");
    ;
    //$("#mnStudent").css("cursor", "default");
    $("#mnEnrollStudent").css("color", "#fff");
    ;
    //$("#mnEnrollStudent").css("cursor", "default");
    $("#mnRegistration").css("color", "#fff");
    ;
    //$("#mnRegistration").css("cursor", "default");
    $("#mnStudentTalents").css("color", "#fff");
    ;
    //$("#mnStudentTalents").css("cursor", "default");
    $("#mnStudentHealth").css("color", "#fff");
    ;
    //$("#mnStudentHealth").css("cursor", "default");
    $("#mnStudentBehavior").css("color", "#fff");
    ;
    //$("#mnStudentBehavior").css("cursor", "default");
    $("#mnTypeSchool").css("color", "#fff");
    ;
    //$("#mnTypeSchool").css("cursor", "default");
    $("#mnMarkUpdate").css("color", "#fff");
    ;
    //$("#mnMarkUpdate").css("cursor", "default");
    $("#mnSchoolReport").css("color", "#fff");
    ;
    //$("#mnSchoolReport").css("cursor", "default");
    $("#mnPrintReport").css("color", "#fff");
    ;
    //$("#mnPrintReport").css("cursor", "default");
    $("#mnReportStudent").css("color", "#fff");
    ;
    //$("#mnReportStudent").css("cursor", "default");
    $("#mnReportTeacher").css("color", "#fff");
    ;
    //$("#mnReportTeacher").css("cursor", "default");
    $("#mnReportTalents").css("color", "#fff");
    ;
    //$("#mnReportTalents").css("cursor", "default");
    $("#mnReportBehavior").css("color", "#fff");
    ;
    //$("#mnReportBehavior").css("cursor", "default");
    $("#mnReportClassPerformance").css("color", "#fff");;
// $("#mnReportClassPerformance").css("cursor", "default");
}

$.fn.enabler=function(ids){
    for(var i=0;i<ids.length;i++){
        $("#"+ids[i]).css("color", "#000");
    }
}