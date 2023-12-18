
(ns source-code-documentation.assemble.css)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @ignore
;
; @constant (string)
(def STYLES "
/*** Body ***/

body {
  font-family: Montserrat;
  margin:      0 0 0 560px;
  padding:     60px 48px }

div {
  box-sizing: border-box }

pre {
  display:        block;
  margin:         0;
  letter-spacing: .8px }

.scroll-container {
  flex-grow:  1;
  overflow-y: auto }

/*** Body ***/



/*** Buttons, links ***/

a,
a:active,
a:hover,
a:visited {
  display:         block;
  text-decoration: none }

a.inline-link {
  display: inline-block }

a.inline-link:hover {
  text-decoration: underline }

.button {
  font-size:      13px;
  letter-spacing: .5px;
  line-height:    18px;
  padding:        3px 12px;
  white-space:    inherit }

.button:hover {
  background-color: #f0f0f0 }

.button--active {
  background-color: #f3f3f3 }

.button--active:hover {
  background-color: #f0f0f0 }

/*** Buttons, links ***/



/*** Text ***/

.text--xs {
  font-size:      10px;
  line-height:    24px;
  text-transform: uppercase }

.text--s {
  font-size:   12px;
  line-height: 18px }

.text--m {
  font-size:   13px;
  line-height: 18px }

/*** Text ***/



/*** Colors ***/

.color--basic {
  color: #303030 }

.color--primary {
  color: #0088cc }

.color--secondary {
  color: #8800cc }

.color--muted {
  color: #606060 }

.color--warning {
  color: #883300 }

/*** Colors ***/



/*** Collapsible ***/

.collapsible-wrapper {
  display:        flex;
  flex-direction: column }

.collapsible-button {
  cursor:      pointer;
  font-weight: 500;
  position:    relative;
  user-select: none;
  width:       fit-content }

.collapsible-button:hover {
  color: #888 }

.collapsible-button::after {
  align-items:     center;
  content:         '▼';
  display:         flex;
  font-size:       8px;
  justify-content: center;
  position:        absolute;
  height:          24px;
  right:           -24px;
  top:             0;
  width:           24px }

.collapsible-wrapper[data-expanded=\"true\"] .collapsible-button::after {
  content: '▲' }

.collapsible-wrapper .content-block--box {
  display: none }

.collapsible-wrapper[data-expanded=\"true\"] .content-block--box {
  display: block }

/*** Collapsible ***/



/*** Top bar ***/

#top-bar {
  background-color: #ffffff;
  border-bottom:    1px solid #e0e0e0;
  display:          flex;
  gap:              6px;
  height:           60px;
  left:             0;
  padding-left:     18px;
  position:         fixed;
  top:              0;
  width:            100% }

#top-bar--library-uri {
  font-size:   12px;
  line-height: 60px;
  padding:     0 18px;
  position:    absolute;
  right:       0;
  top:         0 }

#top-bar--library-uri:hover {
  background-color: #f0f0f0 }

#top-bar--library-name {
  font-size:      18px;
  font-weight:    600;
  line-height:    60px;
  text-transform: uppercase }

#top-bar--author-name {
  font-size: 12px }

#top-bar--library-version {
  font-size:   12px;
  line-height: 18px;
  margin-top:  12px }

/*** Top bar ***/



/*** Bottom bar ***/

#bottom-bar {
  background-color: white;
  border-top:       1px solid #e0e0e0;
  bottom:           0;
  display:          flex;
  justify-content:  right;
  left:             0;
  position:         fixed;
  width:            100% }

#bottom-bar--credits-link {
  color:          #aa55bb;
  font-size:      12px;
  letter-spacing: .8px;
  line-height:    42px;
  padding:        0 18px }

#bottom-bar--credits-link:hover {
  background-color: #f0f0f0 }

/*** Bottom bar ***/



/*** Primary list, secondary list ***/

#primary-list {
  background-color: #fff;
  border-right:     1px solid #e0e0e0;
  display:          flex;
  flex-direction:   column;
  height:           calc(100vh - 60px);
  left:             0;
  padding:          12px 0 54px 0;
  position:         fixed;
  top:              60px;
  width:            280px }

#secondary-list {
  background-color: #fff;
  border-right:     1px solid #e0e0e0;
  display:          flex;
  flex-direction:   column;
  height:           calc(100vh - 60px);
  left:             280px;
  padding:          12px 0 54px 0;
  position:         fixed;
  top:              60px;
  width:            280px }

#primary-list,
#secondary-list {
  /*  Relative positioned elements can overflow the sidebars in case of horizontal scrolling! */
  z-index: 9999 }

#primary-list .text--xs,
#secondary-list .text--xs {
  padding-left: 12px }

.primary-list--container,
.secondary-list--container {
  margin-bottom: 12px }

/*** Primary list, secondary list ***/



/*** Cover ***/

/*** Cover ***/



/*** Namespace header ***/

#namespace-header--title {
  font-size:   18px;
  font-weight: 600;
  line-height: 24px;
  margin-top:  24px }

/*** Namespace header ***/



/*** Declarations ***/

#declarations {
  display:        flex;
  flex-direction: column }

/*** Declarations ***/



/*** Declaration ***/

.declaration--wrapper {
  padding-top: 96px }

.declaration--name {
  border-bottom:  1px solid #e0e0e0;
  font-size:      18px;
  font-weight:    600;
  line-height:    18px;
  padding-bottom: 8px;
  margin-bottom:  12px }

/*** Declaration ***/



/*** Tutorial ***/

.tutorial--wrapper {
  padding-top: 96px }

.tutorial--name {
  border-bottom:  1px solid #e0e0e0;
  font-size:      18px;
  font-weight:    600;
  line-height:    18px;
  padding-bottom: 8px;
  margin-bottom:  12px }

/*** Tutorial ***/



/*** Doc blocks ***/

.content-blocks {
  display: flex;
  flex-direction: column }

.content-block--separator {
  height: 12px }

.content-block--label {
  display:     flex;
  gap:         4px;
  line-height: 24px }

.content-block--box {
  background-color: #fafafa;
  color:            #333;
  line-height:      16px;
  margin:           0;
  padding:          12px 8px }

.content-block--preview-image {
  border:     1px solid #dedede;
  display:    block;
  max-height: 480px;
  max-width:  640px;
  min-height: 48px;
  min-width:  64px }

/*** Doc blocks ***/")
