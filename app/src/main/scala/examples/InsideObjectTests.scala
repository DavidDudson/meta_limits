package examples

object InsideObjectTests {
  @toObject trait foo1
  @toObject object foo2
  @toObject class foo3
  @toObject def foo4 = 2
  @toObject var foo5 = 2
  @toObject val foo6 = 2

  @toObjectBar(7) trait foo7
  @toObjectBar(8) object foo8
  @toObjectBar(9) class foo9
  @toObjectBar(10) def foo10 = 2
  @toObjectBar(11) var foo11 = 2
  @toObjectBar(12) val foo12 = 2

  @toClass trait foo13
  @toClass object foo14
  @toClass class foo15
  @toClass def foo16 = 2
  @toClass var foo17 = 2
  @toClass val foo18 = 2

  @toClassBar(19) trait foo19
  @toClassBar(20) object foo20
  @toClassBar(21) class foo21
  @toClassBar(22) def foo22 = 2
  @toClassBar(23) var foo23 = 2
  @toClassBar(24) val foo24 = 2

  @toTrait trait foo25
  @toTrait object foo26
  @toTrait class foo27
  @toTrait def foo28 = 2
  @toTrait var foo29 = 2
  @toTrait val foo30 = 2

  @toTraitBar(31) trait foo31
  @toTraitBar(32) object foo32
  @toTraitBar(33) class foo33
  @toTraitBar(34) def foo34 = 2
  @toTraitBar(35) var foo35 = 2
  @toTraitBar(36) val foo36 = 2

  @toVal trait foo37
  @toVal object foo38
  @toVal class foo39
  @toVal def foo40 = 2
  @toVal var foo41 = 2
  @toVal val foo42 = 2

  @toValBar(43) trait foo44
  @toValBar(45) object foo45
  @toValBar(46) class foo46
  @toValBar(47) def foo47 = 2
  @toValBar(48) var foo48 = 2
  @toValBar(49) val foo49 = 2

  @toVar trait foo50
  @toVar object foo51
  @toVar class foo52
  @toVar def foo53 = 2
  @toVar var foo54 = 2
  @toVar val foo55 = 2

  @toVarBar(56) trait foo56
  @toVarBar(57) object foo57
  @toVarBar(58) class foo58
  @toVarBar(59) def foo59 = 2
  @toVarBar(60) var foo60 = 2
  @toVarBar(61) val foo61 = 2

  @toDef trait foo62
  @toDef object foo63
  @toDef class foo64
  @toDef def foo65 = 2
  @toDef var foo66 = 2
  @toDef val foo67 = 2

  @toDefBar(68) trait foo68
  @toDefBar(69) object foo69
  @toDefBar(70) class foo70
  @toDefBar(71) def foo71 = 2
  @toDefBar(72) var foo72 = 2
  @toDefBar(73) val foo73 = 2

  @withImport trait foo74
  @withImport object foo75
  @withImport class foo76
  @withImport def foo77 = 2
  @withImport var foo78 = 2
  @withImport val foo79 = 2
}
