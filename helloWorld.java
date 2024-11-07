import repositories.TodoListRepository;
import repositories.TodoListRepositorylmpl;
import services.TodoListService;
import services.TodoListServicelmpl;
import views.TodoListTerminalView;
import views.TodoListView;

public class helloWorld {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositorylmpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }

}
