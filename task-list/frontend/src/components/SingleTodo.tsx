import './styles.css';
import {MdDelete, MdFileDownloadDone} from 'react-icons/md';
import {AiFillEdit} from 'react-icons/ai';
import { Todo } from '../model/model';

type Props = {
    todo: Todo;
    todos: Todo[];
    setTodos: React.Dispatch<React.SetStateAction<Todo[]>>;
}

const SingleTodo = ({todo, todos, setTodos}: Props) => {
    return <form className="todos_single">
        <span className="todos_single-text">
            {todo.todo}
        </span>
        <div>
            <span className="icon"><MdDelete /></span>
            <span className="icon"><AiFillEdit /></span>
            <span className="icon"><MdFileDownloadDone /> </span>
        </div>
        
        
        
    </form>;
}
export default SingleTodo;