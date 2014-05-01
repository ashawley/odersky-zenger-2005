package epfl

abstract class SubjectObserver {
  type S <: Subject
  type O <: Observer
  abstract class Subject { self: S =>
    private var observers: List[O] = List()
    def subscribe(obs: O) =
      observers = obs :: observers
    def publish =
      for (obs <- observers) obs.notify(this)
  }
  abstract class Observer {
    def notify(sub: S): Unit
  }
}
