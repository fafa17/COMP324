package model

import play.api.libs.json.{JsString, JsArray, Json}

/**
 * {
 *    type: //can be people, unit, ship
 *    name: //owner name
 *    pic : [//list of user id]
 *   }
 */
object Location extends AbstractObject{
  override val collection_name: String = "location"

  val KW_NAME = "name"

  //Can be user , unit, devision
  val KW_TYPE = "type"

  val KW_PIC = "pic"

  def createUserLocation(user_id:String ,user_name:String): Unit ={
    Json.obj(
      KW_NAME -> user_name,
      KW_TYPE -> "user",
      KW_PIC -> JsArray(JsString(user_id)::Nil)
    )
  }

}
