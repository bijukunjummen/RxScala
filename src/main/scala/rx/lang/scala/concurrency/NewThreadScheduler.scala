package rx.lang.scala.concurrency

import rx.lang.scala.Scheduler

object NewThreadScheduler {

  /**
   * Returns a [[rx.lang.scala.Scheduler]] that creates a new {@link Thread} for each unit of work.
   */
  def apply(): ImmediateScheduler =  {
    new ImmediateScheduler(rx.concurrency.Schedulers.immediate())
  }
}

class NewThreadScheduler private[scala] (val asJavaScheduler: rx.concurrency.NewThreadScheduler)
  extends Scheduler {}
