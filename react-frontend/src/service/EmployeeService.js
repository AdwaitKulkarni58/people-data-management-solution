import axios from "axios";

const URL = "http://localhost:9191/api/employees";

const id = 2;

class EmployeeService {
  getEmployee() {
    return axios.get(URL + "/" + id);
  }
}

export default new EmployeeService();
