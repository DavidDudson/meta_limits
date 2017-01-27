package examples

import scala.meta._

class toObject extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    defn match {
      case obj: Defn.Object =>
        return q"object ${obj.name}"
      case clazz: Defn.Class =>
        return q"object ${Term.Name(clazz.name.value)}"
      case deff: Defn.Def =>
        return q"object ${deff.name}"
      case Defn.Val(_, Seq(Pat.Var.Term(termName)), _, _) =>
        return q"object $termName"
      case Defn.Var(_, Seq(Pat.Var.Term(termName)), _, _) =>
        return q"object $termName"
      case t: Defn.Trait =>
        return q"object ${Term.Name(t.name.value)}"
    }
  }
}

class toObjectBar(int: Int) extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    val q"new $_(${number: Lit})" = this
    val suffix: Int = number.value.asInstanceOf[Int]
    defn match {
      case _ =>
        return q"object ${Term.Name("bar" + suffix)}"
    }
  }
}

class toClass extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    defn match {
      case obj: Defn.Object =>
        return q"class ${Type.Name(obj.name.value)}"
      case clazz: Defn.Class =>
        return q"class ${clazz.name}"
      case deff: Defn.Def =>
        return q"class ${Type.Name(deff.name.value)}"
      case Defn.Val(_, Seq(Pat.Var.Term(termName)), _, _) =>
        return q"class ${Type.Name(termName.value)}"
      case Defn.Var(_, Seq(Pat.Var.Term(termName)), _, _) =>
        return q"class ${Type.Name(termName.value)}"
      case t: Defn.Trait =>
        return q"class ${t.name}"
    }
  }
}

class toClassBar(int: Int) extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    val q"new $_(${number: Lit})" = this
    val suffix: Int = number.value.asInstanceOf[Int]
    defn match {
      case _ =>
        return q"class ${Type.Name("bar" + suffix)}"
    }
  }
}

class toTrait extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    defn match {
      case obj: Defn.Object =>
        return q"trait ${Type.Name(obj.name.value)}"
      case clazz: Defn.Class =>
        return q"trait ${clazz.name}"
      case deff: Defn.Def =>
        return q"trait ${Type.Name(deff.name.value)}"
      case Defn.Val(_, Seq(Pat.Var.Term(termName)), _, _) =>
        return q"trait ${Type.Name(termName.value)}"
      case Defn.Var(_, Seq(Pat.Var.Term(termName)), _, _) =>
        return q"trait ${Type.Name(termName.value)}"
      case t: Defn.Trait =>
        return q"trait ${t.name}"
    }
  }
}

class toTraitBar(int: Int) extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    val q"new $_(${number: Lit})" = this
    val suffix: Int = number.value.asInstanceOf[Int]
    defn match {
      case _ =>
        return q"trait ${Type.Name("bar" + suffix)}"
    }
  }
}

class toVal extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    defn match {
      case obj: Defn.Object =>
        return q"val ${Pat.Var.Term(obj.name)} = 2"
      case clazz: Defn.Class =>
        return q"val ${Pat.Var.Term(Term.Name(clazz.name.value))} = 2"
      case deff: Defn.Def =>
        return q"val ${Pat.Var.Term(deff.name)} = 2"
      case Defn.Val(_, Seq(p @ Pat.Var.Term(_)), _, _) =>
        return q"val $p = 2"
      case Defn.Var(_, Seq(p @ Pat.Var.Term(_)), _, _) =>
        return q"val $p = 2"
      case t: Defn.Trait =>
        return q"val ${Pat.Var.Term(Term.Name(t.name.value))} = 2"
    }
  }
}

class toValBar(int: Int) extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    val q"new $_(${number: Lit})" = this
    val suffix: Int = number.value.asInstanceOf[Int]
    defn match {
      case _ =>
        return q"val ${Pat.Var.Term(Term.Name("bar" + suffix))} = 2"
    }
  }
}

class toVar extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    defn match {
      case obj: Defn.Object =>
        return q"var ${Pat.Var.Term(obj.name)} = 2"
      case clazz: Defn.Class =>
        return q"var ${Pat.Var.Term(Term.Name(clazz.name.value))} = 2"
      case deff: Defn.Def =>
        return q"var ${Pat.Var.Term(deff.name)} = 2"
      case Defn.Val(_, Seq(p @ Pat.Var.Term(_)), _, _) =>
        return q"var $p = 2"
      case Defn.Var(_, Seq(p @ Pat.Var.Term(_)), _, _) =>
        return q"var $p = 2"
      case t: Defn.Trait =>
        return q"var ${Pat.Var.Term(Term.Name(t.name.value))} = 2"
    }
  }
}

class toVarBar(int: Int) extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    val q"new $_(${number: Lit})" = this
    val suffix: Int = number.value.asInstanceOf[Int]
    defn match {
      case _ =>
        return q"var ${Pat.Var.Term(Term.Name("bar" + suffix))} = 2"
    }
  }
}

class toDef extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    defn match {
      case obj: Defn.Object =>
        return q"def ${obj.name} = 2"
      case clazz: Defn.Class =>
        return q"def ${Term.Name(clazz.name.value)} = 2"
      case deff: Defn.Def =>
        return q"def ${deff.name} = 2"
      case Defn.Val(_, Seq(Pat.Var.Term(termName)), _, _) =>
        return q"def $termName = 2"
      case Defn.Var(_, Seq(Pat.Var.Term(termName)), _, _) =>
        return q"def $termName = 2"
      case t: Defn.Trait =>
        return q"def ${Term.Name(t.name.value)} = 2"
    }
  }
}

class toDefBar(int: Int) extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    val q"new $_(${number: Lit})" = this
    val suffix: Int = number.value.asInstanceOf[Int]
    defn match {
      case _ =>
        return q"def ${Term.Name("bar" + suffix)} = 2"
    }
  }
}

class withCompanion extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    defn match {
      case obj: Defn.Object =>
        val companion = q"class ${Type.Name(obj.name.value)}"
        return q"$obj; $companion"
      case clazz: Defn.Class =>
        val companion = q"object ${Term.Name(clazz.name.value)}"
        return q"$clazz; $companion"
      case t: Term.Block =>
        // This implies that we already have the companion and object
        return t
    }
  }
}

class withImport extends scala.annotation.StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    defn match {
      case t: Tree =>
        val importt = q"import scala.meta._"
        q"$importt; $t"
    }
  }
}