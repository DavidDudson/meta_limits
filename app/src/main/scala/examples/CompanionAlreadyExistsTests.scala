package examples


object InsideObject {
// Does not work, class does not get sent into the macro
//@withCompanion object foo100
//class foo100

  @withCompanion class foo101
  object foo102
}

import scala.meta._;

// Does not work, class does not get sent into the macro
//@withCompanion object foo103
//class foo103

@withCompanion class foo104
object foo104
