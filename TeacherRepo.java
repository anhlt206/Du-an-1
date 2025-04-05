class TeacherRepo {
    private List<Teacher> teachers;

    TeacherRepo() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}