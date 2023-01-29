package homework.worker;

@FunctionalInterface
public interface OnTaskDoneListener {
  void onDone(String result);
}
