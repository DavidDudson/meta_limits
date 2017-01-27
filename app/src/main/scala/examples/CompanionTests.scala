package examples

object Inside {
  @withCompanion object foo2
  @withCompanion class foo3
}

// Can ony gen companion from class, not the inverse
//@withCompanion object foo4
@withCompanion class foo5
