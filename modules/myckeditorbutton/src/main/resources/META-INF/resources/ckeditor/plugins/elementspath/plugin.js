﻿/*
 Copyright (c) 2003-2022, CKSource Holding sp. z o.o. All rights reserved.
 For licensing, see LICENSE.md or https://ckeditor.com/legal/ckeditor-oss-license
*/
(function(){function q(a,c){function k(b){b=h.list[b];var e;b.equals(a.editable())||"true"==b.getAttribute("contenteditable")?(e=a.createRange(),e.selectNodeContents(b),e=e.select()):(e=a.getSelection(),e.selectElement(b));CKEDITOR.env.ie&&a.fire("selectionChange",{selection:e,path:new CKEDITOR.dom.elementPath(b)});a.focus()}function l(){m&&m.setHtml('\x3cspan class\x3d"cke_path_empty"\x3e\x26nbsp;\x3c/span\x3e');delete h.list}var n=a.ui.spaceId("path"),m,h=a._.elementsPath,q=h.idBase;c.html+='\x3cspan id\x3d"'+
n+'_label" class\x3d"cke_voice_label"\x3e'+a.lang.elementspath.eleLabel+'\x3c/span\x3e\x3cspan id\x3d"'+n+'" class\x3d"cke_path" role\x3d"group" aria-labelledby\x3d"'+n+'_label"\x3e\x3cspan class\x3d"cke_path_empty"\x3e\x26nbsp;\x3c/span\x3e\x3c/span\x3e';a.on("uiReady",function(){var b=a.ui.space("path");b&&a.focusManager.add(b,1)});h.onClick=k;var v=CKEDITOR.tools.addFunction(k),w=CKEDITOR.tools.addFunction(function(b,e){var g=h.idBase,d;e=new CKEDITOR.dom.event(e);d="rtl"==a.lang.dir;switch(e.getKeystroke()){case d?
39:37:case 9:return(d=CKEDITOR.document.getById(g+(b+1)))||(d=CKEDITOR.document.getById(g+"0")),d.focus(),!1;case d?37:39:case CKEDITOR.SHIFT+9:return(d=CKEDITOR.document.getById(g+(b-1)))||(d=CKEDITOR.document.getById(g+(h.list.length-1))),d.focus(),!1;case 27:return a.focus(),!1;case 13:case 32:return k(b),!1}return!0});a.on("selectionChange",function(b){for(var e=[],g=h.list=[],d=[],c=h.filters,p=!0,k=b.data.path.elements,u=k.length;u--;){var f=k[u],r=0;b=f.data("cke-display-name")?f.data("cke-display-name"):
f.data("cke-real-element-type")?f.data("cke-real-element-type"):f.getName();(p=f.hasAttribute("contenteditable")?"true"==f.getAttribute("contenteditable"):p)||f.hasAttribute("contenteditable")||(r=1);for(var t=0;t<c.length;t++){var l=c[t](f,b);if(!1===l){r=1;break}b=l||b}r||(g.unshift(f),d.unshift(b))}g=g.length;for(c=0;c<g;c++)b=d[c],p=a.lang.elementspath.eleTitle.replace(/%1/,b),b=x.output({id:q+c,label:p,text:b,jsTitle:"javascript:void('"+b+"')",index:c,keyDownFn:w,clickFn:v}),e.unshift(b);m||
(m=CKEDITOR.document.getById(n));d=m;d.setHtml(e.join("")+'\x3cspan class\x3d"cke_path_empty"\x3e\x26nbsp;\x3c/span\x3e');a.fire("elementsPathUpdate",{space:d})});a.on("readOnly",l);a.on("contentDomUnload",l);a.addCommand("elementsPathFocus",y.toolbarFocus);a.setKeystroke(CKEDITOR.ALT+122,"elementsPathFocus")}var y={toolbarFocus:{editorFocus:!1,readOnly:1,exec:function(a){(a=CKEDITOR.document.getById(a._.elementsPath.idBase+"0"))&&a.focus(CKEDITOR.env.ie||CKEDITOR.env.air)}}},c="";CKEDITOR.env.gecko&&
CKEDITOR.env.mac&&(c+=' onkeypress\x3d"return false;"');CKEDITOR.env.gecko&&(c+=' onblur\x3d"this.style.cssText \x3d this.style.cssText;"');var x=CKEDITOR.addTemplate("pathItem",'\x3ca id\x3d"{id}" href\x3d"{jsTitle}" tabindex\x3d"-1" class\x3d"cke_path_item" title\x3d"{label}"'+c+' hidefocus\x3d"true"  draggable\x3d"false"  ondragstart\x3d"return false;" onkeydown\x3d"return CKEDITOR.tools.callFunction({keyDownFn},{index}, event );" onclick\x3d"CKEDITOR.tools.callFunction({clickFn},{index}); return false;" role\x3d"button" aria-label\x3d"{label}"\x3e{text}\x3c/a\x3e');
CKEDITOR.plugins.add("elementspath",{lang:"af,ar,az,bg,bn,bs,ca,cs,cy,da,de,de-ch,el,en,en-au,en-ca,en-gb,eo,es,es-mx,et,eu,fa,fi,fo,fr,fr-ca,gl,gu,he,hi,hr,hu,is,it,ja,ka,km,ko,ku,lt,lv,mk,mn,ms,nb,nl,no,oc,pl,pt,pt-br,ro,ru,si,sk,sl,sq,sr,sr-latn,sv,th,tr,tt,ug,uk,vi,zh,zh-cn",init:function(a){a._.elementsPath={idBase:"cke_elementspath_"+CKEDITOR.tools.getNextNumber()+"_",filters:[]};a.on("uiSpace",function(c){"bottom"==c.data.space&&q(a,c.data)})}})})();