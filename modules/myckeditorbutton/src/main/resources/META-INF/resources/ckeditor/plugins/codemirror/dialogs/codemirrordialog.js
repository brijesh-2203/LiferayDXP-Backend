﻿CKEDITOR.dialog.add("codemirrordialog",function(e){var g=CKEDITOR.document.getWindow(),f=g.getViewPaneSize(),h=.7*f.height,f=.9*f.width;e.window||(e.window=g);return{_createCodeMirrorEditor:function(){var b=this.dialog,c=b.getSize(),a=b.getContentElement("main","data").getInputElement().$,a=this.codeMirrorEditor=CodeMirror.fromTextArea(a,{lineNumbers:!0,lineWrapping:!0,mode:"text/html"}),c=c.width/2-40,d=this._getTabPanel(),e=this._getTabPanelPadding(),d=d.getSize("height")-(e.bottom+e.top);a.setSize(c,
d);d=b.getParentEditor();a.setValue(d.getData());b=b.getContentElement("main","preview").getElement();b.setSize("width",c);this._createContentIframe(b);a.on("change",this._handleCodeMirrorChange.bind(this))},_createContentIframe:function(b){this.dialog.getParentEditor();var c=this._getTabPanel(),a=this._getTabPanelPadding(),c=c.getSize("height")-(a.bottom+a.top),a=new CKEDITOR.dom.element("iframe");a.on("load",this._handleIframeLoaded.bind(this));b.append(a);a.setAttribute("frameborder",0);a.setStyles({height:c+
"px",width:"99%"});return a},_handleCodeMirrorChange:function(){var b=this.codeMirrorEditor.getValue(),c=this.dialog.getContentElement("main","preview").getElement().findOne("iframe");c&&c.$&&(c.$.contentDocument.body.innerHTML=b)},_handleIframeLoaded:function(b){var c=this.codeMirrorEditor.getValue();b=b.sender;b.addClass("cke_wysiwyg_frame");b.addClass("cke_reset");var a=b.$.contentDocument.body;a.innerHTML=c;var d=b.$.contentDocument,f=d.head,c=e.config.contentsCss;Array.isArray(c)?c.forEach(function(b){var a=
d.createElement("link");a.setAttribute("href",b);a.setAttribute("rel","stylesheet");f.appendChild(a)}):(a=d.createElement("link"),a.setAttribute("href",c),a.setAttribute("rel","stylesheet"),f.appendChild(a));c=e.config.contentsLangDirection;a=d.documentElement;a.setAttribute("dir",c);a.setAttribute("lang",e.config.defaultLanguage);a=d.body;a.classList.add("cke_editable");a.classList.add("cke_editable_themed");a.classList.add("cke_contents_"+c);a.setAttribute("contenteditable",!1);a.setAttribute("spellcheck",
!1);a.style.background="#fff";return b},_getTabPanel:function(){return this.dialog.getContentElement("main").getElement().getAscendant(function(b){return"div"===b.getName()&&"tabpanel"===b.getAttribute("role")})},_getTabPanelPadding:function(){var b=this._getTabPanel().getParent();return{bottom:parseInt(b.getComputedStyle("padding-bottom"),10)||0,top:parseInt(b.getComputedStyle("padding-top"),10)||0}},_handleCodeMirrorChange:function(){var b=this.codeMirrorEditor.getValue(),c=this.dialog.getContentElement("main",
"preview").getElement().findOne("iframe");c&&c.$&&(c.$.contentDocument.body.innerHTML=b)},contents:[{id:"main",elements:[{align:"top",children:[{id:"data",type:"textarea"},{html:'\x3cdiv class\x3d"code_preview"\x3e\x26nbsp;\x3c/div\x3e',id:"preview",type:"html"}],type:"hbox"}]}],height:h,title:e.lang.codemirror.source,width:f,onLoad:function(){this.definition._createCodeMirrorEditor()},onOk:function(){var b=this.definition,c=this.getParentEditor(),b=b.codeMirrorEditor.getValue(),a=c.getData();b!==
a&&c.setData(b);c.setMode("wysiwyg")},onShow:function(){var b=this.definition.codeMirrorEditor,c=this.getParentEditor(),a=c.getData();b&&b.getValue()!==a&&b.setValue(a);c.balloonToolbars&&c.balloonToolbars.hide()}}});