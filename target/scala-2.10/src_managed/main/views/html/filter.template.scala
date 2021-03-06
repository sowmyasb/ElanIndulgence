
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object filter extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- Template for Filters -->
<div class="jumbotron" style="
    width: 300px; padding:30px;
">
<div class="container">
	<div class="control-group pre-scrollable" style="height:150px; border:1px solid #628baf; padding:5px; border-radius:5px">
	  <label class="control-label" for="designers" style="font-weight: bold; text-decoration: underline; text-align: center">DESIGNERS</label>
	  <div class="controls" style="margin-left: 20px; ">
	  	<label class="checkbox" for="designers0">
	      <input type="checkbox" name="designers" id="designers0" value="Anita Reddy">
	      Anita Reddy
	    </label>
	    <label class="checkbox" for="designers1">
	      <input type="checkbox" name="designers" id="designers1" value="Bhargavi Kunam">
	      Bhargavi Kunam
	    </label>
	    <label class="checkbox" for="designers2">
	      <input type="checkbox" name="designers" id="designers2" value="Pawan &amp; Pravan Haute Couture">
	      Pawan &amp; Pravan Haute Couture
	    </label>
	    <label class="checkbox" for="designers3">
	      <input type="checkbox" name="designers" id="designers3" value="Sridevi and Swapna">
	      Sridevi and Swapna
	    </label>
	    <label class="checkbox" for="designers4">
	      <input type="checkbox" name="designers" id="designers4" value="Varuni Gopen">
	      Varuni Gopen
	    </label>
	    <label class="checkbox" for="designers5">
	      <input type="checkbox" name="designers" id="designers5" value="Sanvi">
	      Sanvi
	    </label>
	  </div>
	</div>
	<div class="control-group pre-scrollable" style="height:150px; border:1px solid #628baf; padding:5px; border-radius:5px; margin-top:10px">
	  <label class="control-label" for="boutiques" style="font-weight: bold; text-decoration: underline; text-align: center">BOUTIQUES</label>
	  <div class="controls" style="margin-left: 20px; ">
	  	<label class="checkbox" for="designers0">
	      <input type="checkbox" name="boutiques" id="boutiques0" value="Bhaminee">
	      Bhaminee
	    </label>
	    <label class="checkbox" for="boutiques1">
	      <input type="checkbox" name="boutiques" id="boutiques1" value="Manya Collections">
	      Manya Collections
	    </label>
	    <label class="checkbox" for="boutiques2">
	      <input type="checkbox" name="boutiques" id="boutiques2" value="Polka Dots">
	      Polka Dots
	    </label>
	    <label class="checkbox" for="boutiques3">
	      <input type="checkbox" name="boutiques" id="boutiques3" value="Samyakk">
	      Samyakk
	    </label>
	  </div>
	</div>
	<div class="control-group pre-scrollable" style="height:150px; border:1px solid #628baf; padding:5px; border-radius:5px; margin-top:10px">
	  <label class="control-label" for="types" style="font-weight: bold; text-decoration: underline; text-align: center">TYPES</label>
	  <div class="controls" style="margin-left: 20px; ">
	  	<label class="checkbox" for="types0">
	      <input type="checkbox" name="types" id="types0" value="Sarees">
	      Sarees
	    </label>
	    <label class="checkbox" for="types1">
	      <input type="checkbox" name="types" id="types1" value="Lehengas">
	      Lehengas
	    </label>
	    <label class="checkbox" for="types2">
	      <input type="checkbox" name="types" id="types2" value="Kurtis">
	      Kurtis
	    </label>
	    <label class="checkbox" for="types3">
	      <input type="checkbox" name="types" id="types3" value="Salwar Kameez">
	      Salwar Kameez
	    </label>
	    <label class="checkbox" for="types4">
	      <input type="checkbox" name="types" id="types4" value="Dresses">
	      Dresses
	    </label>
	    <label class="checkbox" for="types5">
	      <input type="checkbox" name="types" id="types5" value="Jewellery">
	      Jewellery
	    </label>
	    <label class="checkbox" for="types6">
	      <input type="checkbox" name="types" id="types6" value="Bags">
	      Bags
	    </label>
	    <label class="checkbox" for="types7">
	      <input type="checkbox" name="types" id="types7" value="Footwear">
	      Footwear
	    </label>
	    <label class="checkbox" for="types8">
	      <input type="checkbox" name="types" id="types8" value="Scarves">
	      Scarves
	    </label>
	    <label class="checkbox" for="types9">
	      <input type="checkbox" name="types" id="types9" value="Sherwani">
	      Sherwani
	    </label>
	    <label class="checkbox" for="types10">
	      <input type="checkbox" name="types" id="types10" value="Kurtas">
	      Kurtas
	    </label>
	    <label class="checkbox" for="types11">
	      <input type="checkbox" name="types" id="types11" value="Suits">
	      Suits
	    </label>
	    <label class="checkbox" for="types12">
	      <input type="checkbox" name="types" id="types12" value="Girls Ethnic">
	      Girls Ethnic
	    </label>
	    <label class="checkbox" for="types13">
	      <input type="checkbox" name="types" id="types13" value="Girls Frocks">
	      Girls Frocks
	    </label>
	    <label class="checkbox" for="types14">
	      <input type="checkbox" name="types" id="types14" value="Boys Ethnic">
	      Boys Ethnic
	    </label>
	  </div>
	</div>
	<div class="control-group pre-scrollable" style="height:150px; border:1px solid #628baf; padding:5px; border-radius:5px; margin-top:10px">
	  <label class="control-label" for="colors" style="font-weight: bold; text-decoration: underline; text-align: center">COLORS</label>
	  <div class="controls" style="margin-left: 20px; ">
	  	<label class="checkbox" for="colors0">
	      <input type="checkbox" name="colors" id="types0" value="Red">
	      Red
	    </label>
	    <label class="checkbox" for="colors1">
	      <input type="checkbox" name="colors" id="colors1" value="Blue">
	      Blue
	    </label>
	    <label class="checkbox" for="colors2">
	      <input type="checkbox" name="colors" id="colors2" value="Green">
	      Green
	    </label>
	    <label class="checkbox" for="colors3">
	      <input type="checkbox" name="colors" id="colors3" value="Black">
	      Black
	    </label>
	    <label class="checkbox" for="colors4">
	      <input type="checkbox" name="colors" id="colors4" value="Yellow">
	      Yellow
	    </label>
	    <label class="checkbox" for="colors5">
	      <input type="checkbox" name="colors" id="colors5" value="Silver">
	      Silver
	    </label>
	    <label class="checkbox" for="colors6">
	      <input type="checkbox" name="colors" id="colors6" value="Gold">
	      Gold
	    </label>
	    <label class="checkbox" for="colors7">
	      <input type="checkbox" name="colors" id="colors7" value="Purple">
	      Purple
	    </label>
	    <label class="checkbox" for="colors8">
	      <input type="checkbox" name="colors" id="colors8" value="Pink">
	      Pink
	    </label>
	    <label class="checkbox" for="colors9">
	      <input type="checkbox" name="colors" id="colors9" value="Orange">
	      Orange
	    </label>
	    <label class="checkbox" for="colors10">
	      <input type="checkbox" name="colors" id="colors10" value="Cream">
	      Cream
	    </label>
	    <label class="checkbox" for="colors11">
	      <input type="checkbox" name="colors" id="colors11" value="White">
	      White
	    </label>
	    <label class="checkbox" for="colors12">
	      <input type="checkbox" name="colors" id="colors12" value="Grey">
	      Grey
	    </label>
	    <label class="checkbox" for="colors13">
	      <input type="checkbox" name="colors" id="colors13" value="Brown">
	      Brown
	    </label>
	  </div>
	</div>
	<div class="control-group" style="height:170px; border:1px solid #628baf; padding:5px; border-radius:5px; margin-top:10px">
	  <label class="control-label" for="radios" style="font-weight: bold; text-decoration: underline; text-align: center">Rating</label>
	  <div class="controls" style="margin-left:20px">
	    <label class="radio inline" for="radios-0">
	      <input type="radio" name="radios" id="radios-0" value="1" checked="checked">
	      1
	    </label>
	    <label class="radio inline" for="radios-1">
	      <input type="radio" name="radios" id="radios-1" value="2">
	      2
	    </label>
	    <label class="radio inline" for="radios-2">
	      <input type="radio" name="radios" id="radios-2" value="3">
	      3
	    </label>
	    <label class="radio inline" for="radios-3">
	      <input type="radio" name="radios" id="radios-3" value="4">
	      4
	    </label>
	    <label class="radio inline" for="radios-4">
	      <input type="radio" name="radios" id="radios-4" value="5">
	      5
	    </label>
	  </div>
	</div>
	<div class="control-group" style="height:70px; border:1px solid #628baf; padding:5px; border-radius:5px; margin-top:10px">
	  <label class="control-label" for="pricefilter" style="font-weight: bold; text-decoration: underline; text-align: center">Price</label>
	  <div class="controls">
	    <select id="pricefilter" name="pricefilter" class="input-xxlarge">
	      <option>Any</option>
	      <option>$0-$100</option>
	      <option>$101-$200</option>
	      <option>$201-300</option>
	      <option>$301-400</option>
	      <option>$401-500</option>
	      <option>&gt;$500</option>
	    </select>
	  </div>
	</div>
	<div class="control-group" style="margin-top: 10px;text-align: center">
	  <label class="control-label" for="applyFilter"></label>
	  <div class="controls">
	    <button id="applyFilter" name="applyFilter" class="btn btn-primary">Apply</button>
	  </div>
	</div>

</div>
</div>
	"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 22 17:34:17 EST 2014
                    SOURCE: /home/sowmya/git/ElanIndulgence/app/views/filter.scala.html
                    HASH: c5bcb92b923f2a2beb568e869f3890961d5deb2e
                    MATRIX: 856->0
                    LINES: 29->1
                    -- GENERATED --
                */
            