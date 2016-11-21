<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html class="nojs html css_verticalspacer" lang="en-US">
 <head>

  <meta http-equiv="Content-type" content="text/html;charset=UTF-8"/>
  <meta name="generator" content="2015.2.1.352"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  
  <script type="text/javascript">
   // Update the 'nojs'/'js' class on the html node
document.documentElement.className = document.documentElement.className.replace(/\bnojs\b/g, 'js');
// Check that all required assets are uploaded and up-to-date
if(typeof Muse == "undefined") window.Muse = {}; window.Muse.assets = {"required":["jquery-1.8.3.min.js", "museutils.js", "museconfig.js", "jquery.musemenu.js", "jquery.watch.js", "require.js", "log-in.css"], "outOfDate":[]};
</script>
  
  <title>LOG IN</title>
  <!-- CSS -->
  <link rel="stylesheet" type="text/css" href="css/site_global.css?crc=3916556066"/>
  <link rel="stylesheet" type="text/css" href="css/master_a-master.css?crc=3998733749"/>
  <link rel="stylesheet" type="text/css" href="css/log-in.css?crc=224248841" id="pagesheet"/>
  <!-- JS includes -->
  <!--[if lt IE 9]>
  <script src="scripts/html5shiv.js?crc=4241844378" type="text/javascript"></script>
  <![endif]-->
   </head>
 <body>

  <div class="clearfix borderbox" id="page"><!-- column -->
   <div class="browser_width colelem" id="u216-bw">
    <div id="u216"><!-- group -->
     <div class="clearfix" id="u216_align_to_page">
      <div class="clip_frame grpelem" id="u265"><!-- image -->
       <img class="block" id="u265_img" src="images/burndown-logo.png?crc=64910648" alt="" data-image-width="221" data-image-height="60"/>
      </div>
      <nav class="MenuBar clearfix grpelem" id="menuu644"><!-- horizontal box -->
       <div class="MenuItemContainer clearfix grpelem" id="u645"><!-- vertical box -->
        <a class="nonblock nontext MenuItem MenuItemWithSubMenu clearfix colelem" id="u648" href="index.html"><!-- horizontal box --><div class="MenuItemLabel NoWrap clearfix grpelem" id="u649-4"><!-- content --><p>&nbsp;HOME</p></div></a>
       </div>
       <div class="MenuItemContainer clearfix grpelem" id="u652"><!-- vertical box -->
        <a class="nonblock nontext MenuItem MenuItemWithSubMenu clearfix colelem" id="u653" href="about.html"><!-- horizontal box --><div class="MenuItemLabel NoWrap clearfix grpelem" id="u654-4"><!-- content --><p>ABOUT</p></div></a>
       </div>
       <div class="MenuItemContainer clearfix grpelem" id="u659"><!-- vertical box -->
        <a class="nonblock nontext MenuItem MenuItemWithSubMenu MuseMenuActive clearfix colelem" id="u660" href="log-in.html"><!-- horizontal box --><div class="MenuItemLabel NoWrap clearfix grpelem" id="u663-4"><!-- content --><p>LOG IN</p></div></a>
       </div>
      </nav>
     </div>
    </div>
   </div>
   <div class="rounded-corners clearfix colelem" id="u710"><!-- column -->
    <div class="clearfix colelem" id="u713-4"><!-- content -->
     <p>LOG IN</p>
    </div>
    <div class="rounded-corners clearfix colelem" id="u716"><!-- group -->
     <div class="clearfix grpelem" id="u722-4"><!-- content -->
      <p><span id="u722">EMAIL</span></p>
     </div>
    </div>
    <div class="rounded-corners clearfix colelem" id="u719"><!-- group -->
     <div class="clearfix grpelem" id="u725-4"><!-- content -->
      <p><span id="u725">PASSWORD</span></p>
     </div>
    </div>
    <div class="rounded-corners clearfix colelem" id="u728"><!-- group -->
     <div class="clearfix grpelem" id="u731-4"><!-- content -->
      <p>SUBMIT</p>
     </div>
    </div>
    <div class="clearfix colelem" id="u734-4"><!-- content -->
     <p>SIGN UP</p>
    </div>
   </div>
   <div class="verticalspacer" data-offset-top="430" data-content-above-spacer="430" data-content-below-spacer="187"></div>
   <div class="browser_width colelem" id="u219-bw">
    <div id="u219"><!-- simple frame --></div>
   </div>
  </div>
  <!-- Other scripts -->
  <script type="text/javascript">
   window.Muse.assets.check=function(d){if(!window.Muse.assets.checked){window.Muse.assets.checked=!0;var b={},c=function(a,b){if(window.getComputedStyle){var c=window.getComputedStyle(a,null);return c&&c.getPropertyValue(b)||c&&c[b]||""}if(document.documentElement.currentStyle)return(c=a.currentStyle)&&c[b]||a.style&&a.style[b]||"";return""},a=function(a){if(a.match(/^rgb/))return a=a.replace(/\s+/g,"").match(/([\d\,]+)/gi)[0].split(","),(parseInt(a[0])<<16)+(parseInt(a[1])<<8)+parseInt(a[2]);if(a.match(/^\#/))return parseInt(a.substr(1),
16);return 0},g=function(g){for(var f=document.getElementsByTagName("link"),i=0;i<f.length;i++)if("text/css"==f[i].type){var h=(f[i].href||"").match(/\/?css\/([\w\-]+\.css)\?crc=(\d+)/);if(!h||!h[1]||!h[2])break;b[h[1]]=h[2]}f=document.createElement("div");f.className="version";f.style.cssText="display:none; width:1px; height:1px;";document.getElementsByTagName("body")[0].appendChild(f);for(i=0;i<Muse.assets.required.length;){var h=Muse.assets.required[i],l=h.match(/([\w\-\.]+)\.(\w+)$/),k=l&&l[1]?
l[1]:null,l=l&&l[2]?l[2]:null;switch(l.toLowerCase()){case "css":k=k.replace(/\W/gi,"_").replace(/^([^a-z])/gi,"_$1");f.className+=" "+k;k=a(c(f,"color"));l=a(c(f,"backgroundColor"));k!=0||l!=0?(Muse.assets.required.splice(i,1),"undefined"!=typeof b[h]&&(k!=b[h]>>>24||l!=(b[h]&16777215))&&Muse.assets.outOfDate.push(h)):i++;f.className="version";break;case "js":k.match(/^jquery-[\d\.]+/gi)&&d&&d().jquery=="1.8.3"?Muse.assets.required.splice(i,1):i++;break;default:throw Error("Unsupported file type: "+
l);}}f.parentNode.removeChild(f);if(Muse.assets.outOfDate.length||Muse.assets.required.length)f="Some files on the server may be missing or incorrect. Clear browser cache and try again. If the problem persists please contact website author.",g&&Muse.assets.outOfDate.length&&(f+="\nOut of date: "+Muse.assets.outOfDate.join(",")),g&&Muse.assets.required.length&&(f+="\nMissing: "+Muse.assets.required.join(",")),alert(f)};location&&location.search&&location.search.match&&location.search.match(/muse_debug/gi)?setTimeout(function(){g(!0)},5E3):g()}};
var muse_init=function(){require.config({baseUrl:""});require(["jquery","museutils","whatinput","jquery.musemenu","jquery.watch"],function(d){var $ = d;$(document).ready(function(){try{
window.Muse.assets.check($);/* body */
Muse.Utils.transformMarkupToFixBrowserProblemsPreInit();/* body */
Muse.Utils.prepHyperlinks(true);/* body */
Muse.Utils.resizeHeight('.browser_width');/* resize height */
Muse.Utils.requestAnimationFrame(function() { $('body').addClass('initialized'); });/* mark body as initialized */
Muse.Utils.fullPage('#page');/* 100% height page */
Muse.Utils.initWidget('.MenuBar', ['#bp_infinity'], function(elem) { return $(elem).museMenu(); });/* unifiedNavBar */
Muse.Utils.showWidgetsWhenReady();/* body */
Muse.Utils.transformMarkupToFixBrowserProblems();/* body */
}catch(b){if(b&&"function"==typeof b.notify?b.notify():Muse.Assert.fail("Error calling selector function: "+b),false)throw b;}})})};
</script>
  <!-- RequireJS script -->
  <script src="scripts/require.js?crc=4108833657" type="text/javascript" async data-main="scripts/museconfig.js?crc=4242129463" onload="if (requirejs) requirejs.onError = function(requireType, requireModule) { if (requireType && requireType.toString && requireType.toString().indexOf && 0 <= requireType.toString().indexOf('#scripterror')) window.Muse.assets.check(); }" onerror="window.Muse.assets.check();"></script>
   </body>
</html>